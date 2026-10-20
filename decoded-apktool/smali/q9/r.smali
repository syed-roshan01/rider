.class public final Lq9/r;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/e;


# static fields
.field public static final a:Lq9/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq9/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq9/r;->a:Lq9/r;

    return-void
.end method


# virtual methods
.method public final getContext()Lu8/j;
    .locals 1

    sget-object v0, Lu8/k;->a:Lu8/k;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
