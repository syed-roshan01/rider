.class public final Lb1/i;
.super Ljava/lang/Object;

# interfaces
.implements Lb1/a;


# static fields
.field public static final a:Lb1/i;

.field public static final b:J

.field public static final c:Lm2/l;

.field public static final d:Lm2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb1/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb1/i;->a:Lb1/i;

    sget-wide v0, Ld1/f;->c:J

    sput-wide v0, Lb1/i;->b:J

    sget-object v0, Lm2/l;->a:Lm2/l;

    sput-object v0, Lb1/i;->c:Lm2/l;

    new-instance v0, Lm2/c;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Lm2/c;-><init>(FF)V

    sput-object v0, Lb1/i;->d:Lm2/c;

    return-void
.end method


# virtual methods
.method public final c()Lm2/b;
    .locals 1

    sget-object v0, Lb1/i;->d:Lm2/c;

    return-object v0
.end method

.method public final e()J
    .locals 2

    sget-wide v0, Lb1/i;->b:J

    return-wide v0
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    sget-object v0, Lb1/i;->c:Lm2/l;

    return-object v0
.end method
