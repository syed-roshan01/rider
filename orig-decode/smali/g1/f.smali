.class public abstract Lg1/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm2/c;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Lm2/c;-><init>(FF)V

    sput-object v0, Lg1/f;->a:Lm2/c;

    return-void
.end method
