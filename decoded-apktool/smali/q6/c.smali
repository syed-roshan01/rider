.class public final Lq6/c;
.super Lq6/b;


# static fields
.field public static final v:Lq6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1f

    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    new-instance v0, Lq6/c;

    const-string v1, "CharMatcher.whitespace()"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq6/c;->v:Lq6/c;

    return-void
.end method
